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

public val DuotoneGroup.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(name = "Package", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.2f, 74.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.1f, 4.1f)
                verticalLineToRelative(98.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.1f, 7.0f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 3.9f, 1.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(1.0f, -106.8f)
                lineTo(33.2f, 74.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 70.8f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(16.7f, 16.7f, 0.0f, false, false, -5.9f, -5.9f)
                lineTo(136.0f, 15.2f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -15.7f, 0.0f)
                lineToRelative(-88.0f, 49.5f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -6.0f, 5.9f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                verticalLineToRelative(0.2f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, -2.1f, 7.8f)
                verticalLineToRelative(98.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 8.2f, 14.0f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 7.2f, 2.0f)
                horizontalLineToRelative(1.4f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 7.1f, -2.0f)
                lineToRelative(88.0f, -49.5f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 8.1f, -14.0f)
                lineTo(232.1f, 78.7f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 230.0f, 70.8f)
                close()
                moveTo(128.1f, 29.2f)
                lineTo(207.9f, 74.0f)
                lineTo(177.2f, 91.4f)
                lineTo(96.6f, 46.9f)
                close()
                moveTo(129.0f, 118.8f)
                lineTo(48.5f, 74.0f)
                lineTo(80.2f, 56.2f)
                lineToRelative(80.7f, 44.5f)
                close()
                moveTo(40.1f, 87.6f)
                lineTo(121.0f, 132.7f)
                lineToRelative(-0.8f, 89.7f)
                lineTo(40.1f, 177.3f)
                close()
                moveTo(136.2f, 222.3f)
                lineTo(137.0f, 132.7f)
                lineTo(169.1f, 114.4f)
                verticalLineToRelative(38.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(185.1f, 105.3f)
                lineToRelative(31.0f, -17.6f)
                verticalLineToRelative(89.6f)
                close()
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
