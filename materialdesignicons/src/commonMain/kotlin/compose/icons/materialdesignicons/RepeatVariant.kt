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

public val MaterialDesignIcons.RepeatVariant: ImageVector
    get() {
        if (_repeatVariant != null) {
            return _repeatVariant!!
        }
        _repeatVariant = Builder(name = "RepeatVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.75f)
                lineTo(10.25f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.5f)
                lineTo(15.5f, 18.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(1.75f)
                lineTo(6.0f, 5.75f)
                moveTo(18.0f, 18.25f)
                lineTo(13.75f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.5f)
                lineTo(8.5f, 6.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.25f)
                lineTo(18.0f, 18.25f)
                close()
            }
        }
        .build()
        return _repeatVariant!!
    }

private var _repeatVariant: ImageVector? = null
