package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) {
            return _chartBarHorizontal!!
        }
        _chartBarHorizontal = Builder(name = "ChartBarHorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 100.0f)
                lineTo(172.0f, 100.0f)
                lineTo(172.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(44.0f, 52.0f)
                lineTo(44.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(36.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(44.0f, 204.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(140.0f, 156.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(220.0f, 104.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 100.0f)
                close()
                moveTo(164.0f, 60.0f)
                verticalLineToRelative(40.0f)
                lineTo(44.0f, 100.0f)
                lineTo(44.0f, 60.0f)
                close()
                moveTo(132.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 156.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(212.0f, 148.0f)
                lineTo(44.0f, 148.0f)
                lineTo(44.0f, 108.0f)
                lineTo(212.0f, 108.0f)
                close()
            }
        }
        .build()
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
