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

public val IonIcons.BodyOutline: ImageVector
    get() {
        if (_bodyOutline != null) {
            return _bodyOutline!!
        }
        _bodyOutline = Builder(name = "BodyOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                moveToRelative(-40.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(199.3f, 295.62f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-30.4f, 172.2f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 19.5f, 27.8f)
                arcToRelative(23.76f, 23.76f, 0.0f, false, false, 27.6f, -19.5f)
                lineToRelative(21.0f, -119.9f)
                verticalLineToRelative(0.2f)
                reflectiveCurveToRelative(5.2f, -32.5f, 17.5f, -32.5f)
                horizontalLineToRelative(3.1f)
                curveToRelative(12.5f, 0.0f, 17.5f, 32.5f, 17.5f, 32.5f)
                verticalLineToRelative(-0.1f)
                lineToRelative(21.0f, 119.9f)
                arcToRelative(23.92f, 23.92f, 0.0f, true, false, 47.1f, -8.4f)
                lineToRelative(-30.4f, -172.2f)
                lineToRelative(-4.9f, -29.7f)
                curveToRelative(-2.9f, -18.1f, -4.2f, -47.6f, 0.5f, -59.7f)
                curveToRelative(4.0f, -10.4f, 14.13f, -14.2f, 23.2f, -14.2f)
                horizontalLineTo(424.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                horizontalLineTo(88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 48.0f)
                horizontalLineToRelative(92.5f)
                curveToRelative(9.23f, 0.0f, 19.2f, 3.8f, 23.2f, 14.2f)
                curveToRelative(4.7f, 12.1f, 3.4f, 41.6f, 0.5f, 59.7f)
                close()
            }
        }
        .build()
        return _bodyOutline!!
    }

private var _bodyOutline: ImageVector? = null
