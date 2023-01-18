package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ChevronDownCircleSharp: ImageVector
    get() {
        if (_chevronDownCircleSharp != null) {
            return _chevronDownCircleSharp!!
        }
        _chevronDownCircleSharp = Builder(name = "ChevronDownCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 464.0f)
                curveToRelative(114.87f, 0.0f, 208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveTo(141.13f, 464.0f, 256.0f, 464.0f)
                close()
                moveTo(160.0f, 193.37f)
                lineToRelative(96.0f, 96.0f)
                lineToRelative(96.0f, -96.0f)
                lineTo(374.63f, 216.0f)
                lineTo(256.0f, 334.63f)
                lineTo(137.37f, 216.0f)
                close()
            }
        }
        .build()
        return _chevronDownCircleSharp!!
    }

private var _chevronDownCircleSharp: ImageVector? = null
