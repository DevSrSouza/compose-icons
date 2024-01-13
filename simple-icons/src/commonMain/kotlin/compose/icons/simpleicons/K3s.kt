package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.K3s: ImageVector
    get() {
        if (_k3s != null) {
            return _k3s!!
        }
        _k3s = Builder(name = "K3s", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.46f, 2.172f)
                lineTo(2.54f, 2.172f)
                arcTo(2.548f, 2.548f, 0.0f, false, false, 0.0f, 4.712f)
                verticalLineToRelative(14.575f)
                arcToRelative(2.548f, 2.548f, 0.0f, false, false, 2.54f, 2.54f)
                horizontalLineToRelative(18.92f)
                arcToRelative(2.548f, 2.548f, 0.0f, false, false, 2.54f, -2.54f)
                lineTo(24.0f, 4.713f)
                arcToRelative(2.548f, 2.548f, 0.0f, false, false, -2.54f, -2.54f)
                close()
                moveTo(10.14f, 16.465f)
                lineTo(5.524f, 19.15f)
                arcToRelative(1.235f, 1.235f, 0.0f, true, true, -1.242f, -2.137f)
                lineTo(8.9f, 14.33f)
                arcToRelative(1.235f, 1.235f, 0.0f, true, true, 1.241f, 2.136f)
                close()
                moveTo(11.957f, 12.377f)
                horizontalLineToRelative(-0.006f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, true, -1.23f, -1.24f)
                lineToRelative(0.023f, -5.32f)
                arcToRelative(1.236f, 1.236f, 0.0f, false, true, 1.236f, -1.23f)
                horizontalLineToRelative(0.005f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, true, 1.23f, 1.241f)
                lineToRelative(-0.023f, 5.32f)
                arcToRelative(1.236f, 1.236f, 0.0f, false, true, -1.235f, 1.23f)
                close()
                moveTo(20.127f, 18.697f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, true, -1.688f, 0.453f)
                lineToRelative(-4.624f, -2.67f)
                arcToRelative(1.235f, 1.235f, 0.0f, true, true, 1.235f, -2.14f)
                lineToRelative(4.624f, 2.67f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, true, 0.452f, 1.688f)
                close()
            }
        }
        .build()
        return _k3s!!
    }

private var _k3s: ImageVector? = null
