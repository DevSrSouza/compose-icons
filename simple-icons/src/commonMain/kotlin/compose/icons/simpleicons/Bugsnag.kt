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

public val SimpleIcons.Bugsnag: ImageVector
    get() {
        if (_bugsnag != null) {
            return _bugsnag!!
        }
        _bugsnag = Builder(name = "Bugsnag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-4.596f, 0.0f, -8.336f, -3.74f, -8.336f, -8.336f)
                verticalLineToRelative(-4.135f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.62f, -0.62f)
                horizontalLineToRelative(2.957f)
                lineTo(7.23f, 1.337f)
                lineTo(4.903f, 2.77f)
                verticalLineToRelative(5.45f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -1.24f, 0.0f)
                lineTo(3.663f, 2.7f)
                curveToRelative(0.0f, -0.384f, 0.204f, -0.749f, 0.53f, -0.95f)
                lineTo(6.773f, 0.166f)
                arcToRelative(1.114f, 1.114f, 0.0f, false, true, 1.699f, 0.949f)
                lineToRelative(0.01f, 9.796f)
                horizontalLineToRelative(3.52f)
                arcToRelative(4.759f, 4.759f, 0.0f, false, true, 4.753f, 4.754f)
                arcToRelative(4.759f, 4.759f, 0.0f, false, true, -4.753f, 4.753f)
                arcToRelative(4.759f, 4.759f, 0.0f, false, true, -4.754f, -4.753f)
                lineToRelative(-0.003f, -3.515f)
                lineTo(4.903f, 12.15f)
                verticalLineToRelative(3.515f)
                curveToRelative(0.0f, 3.912f, 3.183f, 7.097f, 7.097f, 7.097f)
                arcToRelative(7.104f, 7.104f, 0.0f, false, false, 7.097f, -7.097f)
                curveToRelative(0.0f, -3.915f, -3.184f, -7.098f, -7.097f, -7.098f)
                horizontalLineToRelative(-1.076f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.0f, -1.24f)
                lineTo(12.0f, 7.327f)
                curveToRelative(4.596f, 0.0f, 8.336f, 3.74f, 8.336f, 8.336f)
                reflectiveCurveTo(16.596f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(8.482f, 12.15f)
                lineToRelative(0.004f, 3.514f)
                arcTo(3.518f, 3.518f, 0.0f, false, false, 12.0f, 19.178f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, false, 3.514f, -3.514f)
                arcTo(3.518f, 3.518f, 0.0f, false, false, 12.0f, 12.149f)
                close()
                moveTo(12.995f, 15.664f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, -0.995f, 0.994f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, -0.995f, -0.994f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 0.995f, -0.995f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 0.995f, 0.995f)
                close()
            }
        }
        .build()
        return _bugsnag!!
    }

private var _bugsnag: ImageVector? = null
