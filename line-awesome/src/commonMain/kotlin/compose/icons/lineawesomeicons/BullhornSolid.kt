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

public val LineAwesomeIcons.BullhornSolid: ImageVector
    get() {
        if (_bullhornSolid != null) {
            return _bullhornSolid!!
        }
        _bullhornSolid = Builder(name = "BullhornSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 3.031f)
                lineTo(26.406f, 4.188f)
                curveTo(26.406f, 4.188f, 24.418f, 5.664f, 21.563f, 7.125f)
                curveTo(18.707f, 8.586f, 14.988f, 10.0f, 11.719f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 19.125f)
                lineTo(2.031f, 19.281f)
                lineTo(4.031f, 26.281f)
                lineTo(4.25f, 27.0f)
                lineTo(10.313f, 27.0f)
                lineTo(9.969f, 25.719f)
                lineTo(8.344f, 20.0f)
                lineTo(11.719f, 20.0f)
                curveTo(14.945f, 20.0f, 18.664f, 21.441f, 21.531f, 22.906f)
                curveTo(24.398f, 24.371f, 26.406f, 25.813f, 26.406f, 25.813f)
                lineTo(28.0f, 26.969f)
                lineTo(28.0f, 17.813f)
                curveTo(29.156f, 17.395f, 30.0f, 16.293f, 30.0f, 15.0f)
                curveTo(30.0f, 13.707f, 29.156f, 12.605f, 28.0f, 12.188f)
                close()
                moveTo(26.0f, 6.75f)
                lineTo(26.0f, 23.219f)
                curveTo(25.172f, 22.66f, 24.516f, 22.152f, 22.438f, 21.094f)
                curveTo(19.5f, 19.594f, 15.707f, 18.074f, 12.0f, 18.0f)
                lineTo(12.0f, 12.0f)
                curveTo(15.742f, 11.926f, 19.539f, 10.375f, 22.469f, 8.875f)
                curveTo(24.543f, 7.813f, 25.18f, 7.309f, 26.0f, 6.75f)
                close()
                moveTo(4.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(4.344f, 20.0f)
                lineTo(6.25f, 20.0f)
                lineTo(7.656f, 25.0f)
                lineTo(5.75f, 25.0f)
                close()
            }
        }
        .build()
        return _bullhornSolid!!
    }

private var _bullhornSolid: ImageVector? = null
