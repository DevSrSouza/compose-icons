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

public val MaterialDesignIcons.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.11f, 17.0f)
                horizontalLineTo(7.5f)
                lineTo(2.59f, 12.0f)
                lineTo(7.5f, 7.0f)
                horizontalLineTo(10.11f)
                lineTo(11.42f, 4.74f)
                lineTo(18.21f, 3.0f)
                lineTo(20.08f, 9.74f)
                lineTo(18.77f, 12.0f)
                lineTo(20.08f, 14.26f)
                lineTo(18.21f, 21.0f)
                lineTo(11.42f, 19.26f)
                lineTo(10.11f, 17.0f)
                moveTo(10.25f, 16.75f)
                lineTo(15.38f, 18.13f)
                lineTo(12.42f, 13.0f)
                horizontalLineTo(6.5f)
                lineTo(10.25f, 16.75f)
                moveTo(17.12f, 17.13f)
                lineTo(18.5f, 12.0f)
                lineTo(17.12f, 6.87f)
                lineTo(14.15f, 12.0f)
                lineTo(17.12f, 17.13f)
                moveTo(10.25f, 7.25f)
                lineTo(6.5f, 11.0f)
                horizontalLineTo(12.42f)
                lineTo(15.38f, 5.87f)
                lineTo(10.25f, 7.25f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
