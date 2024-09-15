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

public val LineAwesomeIcons.SignInAltSolid: ImageVector
    get() {
        if (_signInAltSolid != null) {
            return _signInAltSolid!!
        }
        _signInAltSolid = Builder(name = "SignInAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(10.422f, 4.0f, 5.742f, 7.832f, 4.406f, 13.0f)
                lineTo(6.469f, 13.0f)
                curveTo(7.746f, 8.945f, 11.531f, 6.0f, 16.0f, 6.0f)
                curveTo(21.516f, 6.0f, 26.0f, 10.484f, 26.0f, 16.0f)
                curveTo(26.0f, 21.516f, 21.516f, 26.0f, 16.0f, 26.0f)
                curveTo(11.531f, 26.0f, 7.746f, 23.055f, 6.469f, 19.0f)
                lineTo(4.406f, 19.0f)
                curveTo(5.742f, 24.168f, 10.422f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(15.344f, 11.281f)
                lineTo(13.906f, 12.719f)
                lineTo(16.188f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(16.188f, 17.0f)
                lineTo(13.906f, 19.281f)
                lineTo(15.344f, 20.719f)
                lineTo(19.344f, 16.719f)
                lineTo(20.031f, 16.0f)
                lineTo(19.344f, 15.281f)
                close()
            }
        }
        .build()
        return _signInAltSolid!!
    }

private var _signInAltSolid: ImageVector? = null
