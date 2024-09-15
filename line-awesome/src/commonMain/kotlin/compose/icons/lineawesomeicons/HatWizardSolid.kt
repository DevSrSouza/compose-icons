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
                curveTo(9.797f, 28.0f, 7.535f, 25.945f, 7.297f, 25.711f)
                lineTo(6.824f, 25.246f)
                lineTo(15.324f, 4.0f)
                lineTo(22.941f, 4.0f)
                lineTo(18.215f, 7.363f)
                lineTo(25.172f, 25.25f)
                lineTo(24.703f, 25.711f)
                curveTo(24.465f, 25.945f, 22.203f, 28.0f, 16.0f, 28.0f)
                close()
                moveTo(9.223f, 24.637f)
                curveTo(10.102f, 25.137f, 12.176f, 26.0f, 16.0f, 26.0f)
                curveTo(19.828f, 26.0f, 21.898f, 25.137f, 22.781f, 24.633f)
                lineTo(16.102f, 7.445f)
                close()
                moveTo(18.0f, 24.0f)
                curveTo(16.344f, 24.0f, 15.0f, 22.656f, 15.0f, 21.0f)
                curveTo(15.0f, 19.344f, 16.344f, 18.0f, 18.0f, 18.0f)
                curveTo(18.262f, 18.0f, 18.508f, 18.043f, 18.75f, 18.105f)
                curveTo(18.031f, 17.426f, 17.066f, 17.0f, 16.0f, 17.0f)
                curveTo(13.789f, 17.0f, 12.0f, 18.789f, 12.0f, 21.0f)
                curveTo(12.0f, 23.211f, 13.789f, 25.0f, 16.0f, 25.0f)
                curveTo(17.066f, 25.0f, 18.031f, 24.574f, 18.75f, 23.895f)
                curveTo(18.508f, 23.957f, 18.262f, 24.0f, 18.0f, 24.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(16.551f, 13.0f, 17.0f, 13.449f, 17.0f, 14.0f)
                curveTo(17.0f, 14.551f, 16.551f, 15.0f, 16.0f, 15.0f)
                curveTo(15.449f, 15.0f, 15.0f, 14.551f, 15.0f, 14.0f)
                curveTo(15.0f, 13.449f, 15.449f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(19.0f, 20.0f)
                curveTo(19.551f, 20.0f, 20.0f, 20.449f, 20.0f, 21.0f)
                curveTo(20.0f, 21.551f, 19.551f, 22.0f, 19.0f, 22.0f)
                curveTo(18.449f, 22.0f, 18.0f, 21.551f, 18.0f, 21.0f)
                curveTo(18.0f, 20.449f, 18.449f, 20.0f, 19.0f, 20.0f)
                close()
            }
        }
        .build()
        return _hatWizardSolid!!
    }

private var _hatWizardSolid: ImageVector? = null
