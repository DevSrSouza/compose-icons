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

public val LineAwesomeIcons.UnlinkSolid: ImageVector
    get() {
        if (_unlinkSolid != null) {
            return _unlinkSolid!!
        }
        _unlinkSolid = Builder(name = "UnlinkSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 4.0f)
                curveTo(20.148f, 4.0f, 18.531f, 4.625f, 17.313f, 5.844f)
                lineTo(15.844f, 7.313f)
                curveTo(14.828f, 8.328f, 14.227f, 9.617f, 14.063f, 10.938f)
                lineTo(16.063f, 11.188f)
                curveTo(16.176f, 10.281f, 16.559f, 9.41f, 17.25f, 8.719f)
                lineTo(18.719f, 7.25f)
                curveTo(20.391f, 5.578f, 23.078f, 5.578f, 24.75f, 7.25f)
                curveTo(26.422f, 8.922f, 26.422f, 11.609f, 24.75f, 13.281f)
                lineTo(23.281f, 14.75f)
                lineTo(23.25f, 14.75f)
                curveTo(22.559f, 15.445f, 21.715f, 15.828f, 20.813f, 15.938f)
                lineTo(21.063f, 17.938f)
                curveTo(22.383f, 17.773f, 23.672f, 17.172f, 24.688f, 16.156f)
                lineTo(26.156f, 14.688f)
                curveTo(28.59f, 12.254f, 28.59f, 8.277f, 26.156f, 5.844f)
                curveTo(24.938f, 4.625f, 23.352f, 4.0f, 21.75f, 4.0f)
                close()
                moveTo(7.719f, 6.281f)
                lineTo(6.281f, 7.719f)
                lineTo(10.281f, 11.719f)
                lineTo(11.719f, 10.281f)
                close()
                moveTo(10.938f, 14.063f)
                curveTo(9.617f, 14.227f, 8.328f, 14.828f, 7.313f, 15.844f)
                lineTo(5.844f, 17.313f)
                curveTo(3.41f, 19.746f, 3.41f, 23.723f, 5.844f, 26.156f)
                curveTo(8.277f, 28.59f, 12.254f, 28.59f, 14.688f, 26.156f)
                lineTo(16.156f, 24.688f)
                curveTo(17.172f, 23.672f, 17.773f, 22.383f, 17.938f, 21.063f)
                lineTo(15.938f, 20.813f)
                curveTo(15.824f, 21.719f, 15.441f, 22.59f, 14.75f, 23.281f)
                lineTo(13.281f, 24.75f)
                curveTo(11.609f, 26.422f, 8.922f, 26.422f, 7.25f, 24.75f)
                curveTo(5.578f, 23.078f, 5.578f, 20.391f, 7.25f, 18.719f)
                lineTo(8.719f, 17.25f)
                lineTo(8.75f, 17.25f)
                curveTo(9.441f, 16.555f, 10.285f, 16.172f, 11.188f, 16.063f)
                close()
                moveTo(21.719f, 20.281f)
                lineTo(20.281f, 21.719f)
                lineTo(24.281f, 25.719f)
                lineTo(25.719f, 24.281f)
                close()
            }
        }
        .build()
        return _unlinkSolid!!
    }

private var _unlinkSolid: ImageVector? = null
