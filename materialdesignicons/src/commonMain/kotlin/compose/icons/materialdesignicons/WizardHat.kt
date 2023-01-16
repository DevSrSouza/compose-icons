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

public val MaterialDesignIcons.WizardHat: ImageVector
    get() {
        if (_wizardHat != null) {
            return _wizardHat!!
        }
        _wizardHat = Builder(name = "WizardHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                lineTo(11.1f, 2.6f)
                curveTo(11.3f, 2.2f, 11.6f, 2.0f, 12.0f, 2.0f)
                lineTo(18.0f, 5.0f)
                horizontalLineTo(13.9f)
                lineTo(19.0f, 19.0f)
                moveTo(10.0f, 7.5f)
                lineTo(11.04f, 7.97f)
                lineTo(11.5f, 9.0f)
                lineTo(11.97f, 7.97f)
                lineTo(13.0f, 7.5f)
                lineTo(11.97f, 7.03f)
                lineTo(11.5f, 6.0f)
                lineTo(11.04f, 7.03f)
                lineTo(10.0f, 7.5f)
                moveTo(13.0f, 15.0f)
                lineTo(10.94f, 14.07f)
                lineTo(10.0f, 12.0f)
                lineTo(9.07f, 14.07f)
                lineTo(7.0f, 15.0f)
                lineTo(9.07f, 15.93f)
                lineTo(10.0f, 18.0f)
                lineTo(10.94f, 15.93f)
                lineTo(13.0f, 15.0f)
                moveTo(13.97f, 11.97f)
                lineTo(15.0f, 11.5f)
                lineTo(13.97f, 11.03f)
                lineTo(13.5f, 10.0f)
                lineTo(13.04f, 11.03f)
                lineTo(12.0f, 11.5f)
                lineTo(13.04f, 11.97f)
                lineTo(13.5f, 13.0f)
                lineTo(13.97f, 11.97f)
                moveTo(15.97f, 15.97f)
                lineTo(17.0f, 15.5f)
                lineTo(15.97f, 15.03f)
                lineTo(15.5f, 14.0f)
                lineTo(15.04f, 15.03f)
                lineTo(14.0f, 15.5f)
                lineTo(15.04f, 15.97f)
                lineTo(15.5f, 17.0f)
                lineTo(15.97f, 15.97f)
                close()
            }
        }
        .build()
        return _wizardHat!!
    }

private var _wizardHat: ImageVector? = null
