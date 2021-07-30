package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Marker: ImageVector
    get() {
        if (_marker != null) {
            return _marker!!
        }
        _marker = Builder(name = "Marker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.95f, 290.03f)
                arcTo(327.038f, 327.038f, 0.0f, false, false, 0.17f, 485.11f)
                lineToRelative(-0.03f, 0.23f)
                curveToRelative(-1.7f, 15.28f, 11.21f, 28.2f, 26.49f, 26.51f)
                arcToRelative(327.02f, 327.02f, 0.0f, false, false, 195.34f, -93.8f)
                lineToRelative(75.4f, -75.4f)
                lineToRelative(-128.02f, -128.02f)
                lineToRelative(-75.4f, 75.4f)
                close()
                moveTo(485.49f, 26.51f)
                curveToRelative(-35.35f, -35.35f, -92.67f, -35.35f, -128.02f, 0.0f)
                lineToRelative(-21.76f, 21.76f)
                lineToRelative(-36.56f, -36.55f)
                curveToRelative(-15.62f, -15.62f, -40.95f, -15.62f, -56.56f, 0.0f)
                lineTo(138.47f, 115.84f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineToRelative(87.15f, -87.15f)
                lineToRelative(19.59f, 19.59f)
                lineTo(191.98f, 192.0f)
                lineTo(320.0f, 320.02f)
                lineToRelative(165.49f, -165.49f)
                curveToRelative(35.35f, -35.35f, 35.35f, -92.66f, 0.0f, -128.02f)
                close()
            }
        }
        .build()
        return _marker!!
    }

private var _marker: ImageVector? = null
