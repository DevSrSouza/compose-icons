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

public val SolidGroup.StarOfLife: ImageVector
    get() {
        if (_starOfLife != null) {
            return _starOfLife!!
        }
        _starOfLife = Builder(name = "StarOfLife", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(172.9f)
                lineToRelative(122.0f, -70.4f)
                curveToRelative(15.3f, -8.8f, 34.9f, -3.6f, 43.7f, 11.7f)
                lineToRelative(16.0f, 27.7f)
                curveToRelative(8.8f, 15.3f, 3.6f, 34.9f, -11.7f, 43.7f)
                lineTo(352.0f, 256.0f)
                lineToRelative(122.0f, 70.4f)
                curveToRelative(15.3f, 8.8f, 20.5f, 28.4f, 11.7f, 43.7f)
                lineToRelative(-16.0f, 27.7f)
                curveToRelative(-8.8f, 15.3f, -28.4f, 20.6f, -43.7f, 11.7f)
                lineTo(304.0f, 339.1f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(339.1f)
                lineTo(86.0f, 409.6f)
                curveToRelative(-15.3f, 8.8f, -34.9f, 3.6f, -43.7f, -11.7f)
                lineToRelative(-16.0f, -27.7f)
                curveToRelative(-8.8f, -15.3f, -3.6f, -34.9f, 11.7f, -43.7f)
                lineTo(160.0f, 256.0f)
                lineTo(38.0f, 185.6f)
                curveToRelative(-15.3f, -8.8f, -20.5f, -28.4f, -11.7f, -43.7f)
                lineToRelative(16.0f, -27.7f)
                curveTo(51.1f, 98.8f, 70.7f, 93.6f, 86.0f, 102.4f)
                lineToRelative(122.0f, 70.4f)
                verticalLineTo(32.0f)
                close()
            }
        }
        .build()
        return _starOfLife!!
    }

private var _starOfLife: ImageVector? = null
