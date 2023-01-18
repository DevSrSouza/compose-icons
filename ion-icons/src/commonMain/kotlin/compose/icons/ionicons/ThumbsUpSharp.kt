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

public val IonIcons.ThumbsUpSharp: ImageVector
    get() {
        if (_thumbsUpSharp != null) {
            return _thumbsUpSharp!!
        }
        _thumbsUpSharp = Builder(name = "ThumbsUpSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 192.0f)
                lineTo(300.0f, 180.0f)
                lineToRelative(23.0f, -89.4f)
                curveTo(329.0f, 64.0f, 322.22f, 48.73f, 300.53f, 42.0f)
                lineToRelative(-34.69f, -9.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.4f, 1.72f)
                lineToRelative(-129.0f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.81f, 3.81f)
                horizontalLineTo(16.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(133.61f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 15.18f, 2.46f)
                lineToRelative(76.3f, 25.43f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 25.3f, 4.11f)
                horizontalLineTo(428.32f)
                curveToRelative(19.0f, 0.0f, 31.5f, -13.52f, 35.23f, -32.16f)
                lineTo(496.0f, 305.58f)
                verticalLineTo(232.0f)
                curveTo(496.0f, 209.94f, 478.0f, 194.0f, 456.0f, 192.0f)
                close()
            }
        }
        .build()
        return _thumbsUpSharp!!
    }

private var _thumbsUpSharp: ImageVector? = null
