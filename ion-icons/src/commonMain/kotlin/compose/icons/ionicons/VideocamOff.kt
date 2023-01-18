package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.VideocamOff: ImageVector
    get() {
        if (_videocamOff != null) {
            return _videocamOff!!
        }
        _videocamOff = Builder(name = "VideocamOff", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 179.52f)
                arcTo(67.52f, 67.52f, 0.0f, false, false, 268.48f, 112.0f)
                horizontalLineToRelative(-79.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.82f, 6.83f)
                lineTo(329.17f, 261.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.83f, -2.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 180.0f)
                verticalLineTo(332.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineTo(268.0f)
                arcToRelative(67.66f, 67.66f, 0.0f, false, false, 42.84f, -15.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.33f, -6.0f)
                lineTo(54.41f, 122.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.87f, -0.62f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 16.0f, 180.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 384.39f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -13.0f, -2.77f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, true, -2.71f, -1.54f)
                lineToRelative(-82.71f, -58.22f)
                horizontalLineToRelative(0.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 352.0f, 295.7f)
                verticalLineTo(216.3f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 13.58f, -26.16f)
                lineToRelative(82.71f, -58.22f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, true, 2.71f, -1.54f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 45.0f, 29.24f)
                verticalLineTo(352.38f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 416.0f)
                lineTo(80.0f, 80.0f)
            }
        }
        .build()
        return _videocamOff!!
    }

private var _videocamOff: ImageVector? = null
