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

public val MaterialDesignIcons.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 7.0f)
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.55f, 2.22f, 12.05f, 2.59f, 12.41f)
                lineTo(11.58f, 21.41f)
                curveTo(11.95f, 21.77f, 12.45f, 22.0f, 13.0f, 22.0f)
                curveTo(13.55f, 22.0f, 14.05f, 21.77f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.78f, 14.05f, 22.0f, 13.55f, 22.0f, 13.0f)
                curveTo(22.0f, 12.44f, 21.77f, 11.94f, 21.41f, 11.58f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
