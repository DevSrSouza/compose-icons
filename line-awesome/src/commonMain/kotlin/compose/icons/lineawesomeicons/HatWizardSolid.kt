package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.HatWizardSolid: ImageVector
    get() {
        if (_hatWizardSolid != null) {
            return _hatWizardSolid!!
        }
        _hatWizardSolid = Builder(name = "HatWizardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 28.0f)
                curveTo(9.7969f, 28.0f, 7.5352f, 25.9453f, 7.2969f, 25.7109f)
                lineTo(6.8242f, 25.2461f)
                lineTo(15.3242f, 4.0f)
                lineTo(22.9414f, 4.0f)
                lineTo(18.2148f, 7.3633f)
                lineTo(25.1719f, 25.25f)
                lineTo(24.7031f, 25.7109f)
                curveTo(24.4648f, 25.9453f, 22.2031f, 28.0f, 16.0f, 28.0f)
                close()
                moveTo(9.2227f, 24.6367f)
                curveTo(10.1016f, 25.1367f, 12.1758f, 26.0f, 16.0f, 26.0f)
                curveTo(19.8281f, 26.0f, 21.8984f, 25.1367f, 22.7813f, 24.6328f)
                lineTo(16.1016f, 7.4453f)
                close()
                moveTo(18.0f, 24.0f)
                curveTo(16.3438f, 24.0f, 15.0f, 22.6563f, 15.0f, 21.0f)
                curveTo(15.0f, 19.3438f, 16.3438f, 18.0f, 18.0f, 18.0f)
                curveTo(18.2617f, 18.0f, 18.5078f, 18.043f, 18.75f, 18.1055f)
                curveTo(18.0313f, 17.4258f, 17.0664f, 17.0f, 16.0f, 17.0f)
                curveTo(13.7891f, 17.0f, 12.0f, 18.7891f, 12.0f, 21.0f)
                curveTo(12.0f, 23.2109f, 13.7891f, 25.0f, 16.0f, 25.0f)
                curveTo(17.0664f, 25.0f, 18.0313f, 24.5742f, 18.75f, 23.8945f)
                curveTo(18.5078f, 23.957f, 18.2617f, 24.0f, 18.0f, 24.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(16.5508f, 13.0f, 17.0f, 13.4492f, 17.0f, 14.0f)
                curveTo(17.0f, 14.5508f, 16.5508f, 15.0f, 16.0f, 15.0f)
                curveTo(15.4492f, 15.0f, 15.0f, 14.5508f, 15.0f, 14.0f)
                curveTo(15.0f, 13.4492f, 15.4492f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(19.0f, 20.0f)
                curveTo(19.5508f, 20.0f, 20.0f, 20.4492f, 20.0f, 21.0f)
                curveTo(20.0f, 21.5508f, 19.5508f, 22.0f, 19.0f, 22.0f)
                curveTo(18.4492f, 22.0f, 18.0f, 21.5508f, 18.0f, 21.0f)
                curveTo(18.0f, 20.4492f, 18.4492f, 20.0f, 19.0f, 20.0f)
                close()
            }
        }
        .build()
        return _hatWizardSolid!!
    }

private var _hatWizardSolid: ImageVector? = null
