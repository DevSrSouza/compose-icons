package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.EmoticonNeutralOutline: ImageVector
    get() {
        if (_emoticonNeutralOutline != null) {
            return _emoticonNeutralOutline!!
        }
        _emoticonNeutralOutline = Builder(name = "EmoticonNeutralOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(8.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 11.0f)
                moveTo(17.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 9.5f)
                moveTo(16.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _emoticonNeutralOutline!!
    }

private var _emoticonNeutralOutline: ImageVector? = null
