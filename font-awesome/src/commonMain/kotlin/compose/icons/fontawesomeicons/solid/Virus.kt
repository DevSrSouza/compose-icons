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

public val SolidGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.55f, 227.55f)
                lineTo(462.0f, 227.55f)
                curveToRelative(-50.68f, 0.0f, -76.07f, -61.27f, -40.23f, -97.11f)
                lineTo(437.0f, 115.19f)
                arcTo(28.44f, 28.44f, 0.0f, false, false, 396.8f, 75.0f)
                lineTo(381.56f, 90.22f)
                curveToRelative(-35.84f, 35.83f, -97.11f, 10.45f, -97.11f, -40.23f)
                lineTo(284.45f, 28.44f)
                arcToRelative(28.45f, 28.45f, 0.0f, false, false, -56.9f, 0.0f)
                lineTo(227.55f, 50.0f)
                curveToRelative(0.0f, 50.68f, -61.27f, 76.06f, -97.11f, 40.23f)
                lineTo(115.2f, 75.0f)
                arcTo(28.44f, 28.44f, 0.0f, false, false, 75.0f, 115.19f)
                lineToRelative(15.25f, 15.25f)
                curveToRelative(35.84f, 35.84f, 10.45f, 97.11f, -40.23f, 97.11f)
                lineTo(28.45f, 227.55f)
                arcToRelative(28.45f, 28.45f, 0.0f, true, false, 0.0f, 56.89f)
                lineTo(50.0f, 284.44f)
                curveToRelative(50.68f, 0.0f, 76.07f, 61.28f, 40.23f, 97.12f)
                lineTo(75.0f, 396.8f)
                arcTo(28.45f, 28.45f, 0.0f, false, false, 115.2f, 437.0f)
                lineToRelative(15.24f, -15.25f)
                curveToRelative(35.84f, -35.84f, 97.11f, -10.45f, 97.11f, 40.23f)
                verticalLineToRelative(21.54f)
                arcToRelative(28.45f, 28.45f, 0.0f, false, false, 56.9f, 0.0f)
                lineTo(284.45f, 462.0f)
                curveToRelative(0.0f, -50.68f, 61.27f, -76.07f, 97.11f, -40.23f)
                lineTo(396.8f, 437.0f)
                arcTo(28.45f, 28.45f, 0.0f, false, false, 437.0f, 396.8f)
                lineToRelative(-15.25f, -15.24f)
                curveToRelative(-35.84f, -35.84f, -10.45f, -97.12f, 40.23f, -97.12f)
                horizontalLineToRelative(21.54f)
                arcToRelative(28.45f, 28.45f, 0.0f, true, false, 0.0f, -56.89f)
                close()
                moveTo(224.0f, 272.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 224.0f, 272.0f)
                close()
                moveTo(304.0f, 328.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 304.0f, 328.0f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
