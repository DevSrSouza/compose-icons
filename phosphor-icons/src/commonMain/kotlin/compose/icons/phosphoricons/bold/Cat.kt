package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 140.0f)
                close()
                moveTo(172.0f, 124.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 172.0f, 124.0f)
                close()
                moveTo(236.0f, 51.3f)
                lineTo(236.0f, 136.0f)
                curveToRelative(0.0f, 55.1f, -48.4f, 100.0f, -108.0f, 100.0f)
                reflectiveCurveTo(20.0f, 191.1f, 20.0f, 136.0f)
                lineTo(20.0f, 51.3f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 54.1f, 37.2f)
                lineToRelative(15.0f, 15.0f)
                arcTo(114.5f, 114.5f, 0.0f, false, true, 105.0f, 38.3f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, 1.8f, -0.3f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, true, 42.4f, 0.0f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, 1.8f, 0.3f)
                arcToRelative(114.5f, 114.5f, 0.0f, false, true, 35.9f, 13.9f)
                lineToRelative(15.0f, -15.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 236.0f, 51.3f)
                close()
                moveTo(212.0f, 61.0f)
                lineTo(196.9f, 76.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.7f, 1.1f)
                arcTo(86.9f, 86.9f, 0.0f, false, false, 160.0f, 65.7f)
                lineTo(160.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(136.0f, 60.4f)
                arcToRelative(80.2f, 80.2f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(96.0f, 65.7f)
                arcTo(86.9f, 86.9f, 0.0f, false, false, 74.8f, 77.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.7f, -1.1f)
                lineTo(44.0f, 61.0f)
                verticalLineToRelative(75.0f)
                curveToRelative(0.0f, 38.2f, 31.3f, 69.9f, 72.0f, 75.2f)
                lineTo(116.0f, 197.0f)
                lineToRelative(-12.5f, -12.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 175.0f)
                lineToRelative(7.5f, -7.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(140.0f, 197.0f)
                verticalLineToRelative(14.2f)
                curveToRelative(40.7f, -5.3f, 72.0f, -37.0f, 72.0f, -75.2f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
