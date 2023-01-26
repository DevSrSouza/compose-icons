package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SignalWifi4BarLock: ImageVector
    get() {
        if (_signalWifi4BarLock != null) {
            return _signalWifi4BarLock!!
        }
        _signalWifi4BarLock = Builder(name = "SignalWifi4BarLock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.98f, 11.0f)
                lineTo(24.0f, 8.98f)
                curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f)
                curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f)
                lineToRelative(6.35f, 6.36f)
                lineTo(12.0f, 21.0f)
                lineToRelative(3.05f, -3.05f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, -0.45f, 0.09f, -0.88f, 0.23f, -1.29f)
                curveToRelative(0.54f, -1.57f, 2.01f, -2.71f, 3.77f, -2.71f)
                horizontalLineTo(21.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.11f)
                curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-0.12f, -0.02f, -0.24f, -0.02f, -0.36f, -0.02f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.0f)
                curveTo(18.88f, 13.03f, 18.0f, 13.91f, 18.0f, 15.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, 0.0f, -0.45f, 0.0f, -1.0f, 0.0f)
                verticalLineTo(15.11f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _signalWifi4BarLock!!
    }

private var _signalWifi4BarLock: ImageVector? = null
