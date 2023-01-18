package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Videocam: ImageVector
    get() {
        if (_videocam != null) {
            return _videocam!!
        }
        _videocam = Builder(name = "Videocam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.0f, 400.0f)
                horizontalLineTo(84.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f)
                verticalLineTo(180.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, 68.0f, -68.0f)
                horizontalLineTo(268.48f)
                arcTo(67.6f, 67.6f, 0.0f, false, true, 336.0f, 179.52f)
                verticalLineTo(332.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 268.0f, 400.0f)
                close()
            }
        }
        .build()
        return _videocam!!
    }

private var _videocam: ImageVector? = null
