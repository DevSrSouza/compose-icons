package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.0f, 56.3f)
                arcTo(32.3f, 32.3f, 0.0f, false, false, 199.7f, 30.0f)
                curveToRelative(-31.4f, -5.3f, -90.4f, -7.7f, -133.9f, 35.8f)
                reflectiveCurveTo(24.7f, 168.3f, 30.0f, 199.7f)
                arcTo(32.3f, 32.3f, 0.0f, false, false, 56.3f, 226.0f)
                arcToRelative(206.3f, 206.3f, 0.0f, false, false, 33.3f, 2.8f)
                curveToRelative(31.1f, 0.0f, 69.8f, -7.7f, 100.6f, -38.6f)
                curveTo(233.7f, 146.7f, 231.3f, 87.7f, 226.0f, 56.3f)
                close()
                moveTo(59.0f, 210.2f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 45.8f, 197.0f)
                arcToRelative(178.7f, 178.7f, 0.0f, false, true, -2.7f, -30.6f)
                lineToRelative(46.5f, 46.5f)
                arcTo(179.5f, 179.5f, 0.0f, false, true, 59.0f, 210.2f)
                close()
                moveTo(165.7f, 101.7f)
                lineToRelative(-15.1f, 15.0f)
                lineToRelative(9.0f, 9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.7f, 2.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.6f, -2.3f)
                lineToRelative(-9.0f, -9.0f)
                lineTo(128.0f, 139.3f)
                lineToRelative(9.0f, 9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -5.7f, 2.3f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -5.6f, -2.3f)
                lineToRelative(-9.0f, -9.0f)
                lineToRelative(-15.0f, 15.1f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(15.1f, -15.0f)
                lineToRelative(-9.0f, -9.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 107.7f, 119.0f)
                lineToRelative(9.0f, 9.0f)
                lineTo(128.0f, 116.7f)
                lineToRelative(-9.0f, -9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.3f)
                lineToRelative(9.0f, 9.0f)
                lineToRelative(15.0f, -15.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
                moveTo(166.4f, 43.1f)
                arcTo(179.5f, 179.5f, 0.0f, false, true, 197.0f, 45.8f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 210.2f, 59.0f)
                arcToRelative(178.7f, 178.7f, 0.0f, false, true, 2.7f, 30.6f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
