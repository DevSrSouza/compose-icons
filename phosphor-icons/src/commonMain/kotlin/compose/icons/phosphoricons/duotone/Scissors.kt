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

public val DuotoneGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(60.0f, 76.0f)
                moveToRelative(-28.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 56.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -56.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(60.0f, 180.0f)
                moveToRelative(-28.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 56.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -56.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.3f, 116.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 4.6f, -1.4f)
                lineToRelative(67.6f, -46.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 2.1f, -11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.1f, -2.1f)
                lineTo(159.8f, 102.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.5f, 14.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.5f, 187.1f)
                lineTo(93.5f, 89.2f)
                arcTo(36.4f, 36.4f, 0.0f, false, false, 96.0f, 76.0f)
                arcTo(35.9f, 35.9f, 0.0f, false, false, 85.5f, 50.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -51.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 49.9f, 51.9f)
                lineTo(121.8f, 128.0f)
                lineTo(84.4f, 153.6f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 96.0f, 180.0f)
                arcToRelative(36.4f, 36.4f, 0.0f, false, false, -2.5f, -13.2f)
                lineTo(136.0f, 137.7f)
                lineToRelative(91.5f, 62.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.5f, 1.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.5f, -14.6f)
                close()
                moveTo(74.1f, 194.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, -28.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, 28.2f)
                close()
                moveTo(45.9f, 90.1f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, -28.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, 28.2f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 45.9f, 90.1f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
