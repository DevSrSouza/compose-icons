package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(92.8f, 217.3f)
                arcToRelative(95.2f, 95.2f, 0.0f, false, false, 37.1f, 6.7f)
                curveToRelative(51.5f, -1.0f, 93.4f, -43.1f, 94.1f, -94.6f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(64.0f)
                lineTo(16.0f, 128.0f)
                lineToRelative(13.8f, 19.1f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 23.5f, 9.6f)
                curveToRelative(17.5f, -2.9f, 48.1f, -4.7f, 74.7f, 11.3f)
                horizontalLineToRelative(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 100.0f)
                moveToRelative(-12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.1f, 55.0f)
                arcTo(103.2f, 103.2f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(59.5f)
                lineTo(11.8f, 121.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.6f, 5.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 1.3f, 6.3f)
                lineToRelative(13.8f, 19.1f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, false, 31.3f, 12.8f)
                curveToRelative(13.7f, -2.3f, 38.6f, -4.2f, 61.6f, 6.2f)
                lineTo(90.0f, 207.4f)
                arcToRelative(91.1f, 91.1f, 0.0f, false, true, -20.7f, -13.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.7f, 11.3f)
                arcTo(103.5f, 103.5f, 0.0f, false, false, 128.0f, 232.0f)
                horizontalLineToRelative(2.1f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 72.0f, -177.0f)
                close()
                moveTo(190.3f, 190.0f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, true, -60.5f, 26.0f)
                arcToRelative(88.7f, 88.7f, 0.0f, false, true, -24.2f, -2.9f)
                lineToRelative(26.6f, -37.3f)
                arcTo(56.1f, 56.1f, 0.0f, false, false, 184.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(39.9f, 39.9f, 0.0f, false, true, -38.0f, 39.9f)
                curveToRelative(-28.7f, -16.2f, -61.1f, -13.9f, -78.0f, -11.1f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -15.7f, -6.4f)
                lineToRelative(-8.8f, -12.1f)
                lineToRelative(96.7f, -59.5f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 128.0f, 64.0f)
                verticalLineTo(40.0f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, true, 62.3f, 150.0f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
