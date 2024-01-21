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

public val SimpleIcons.Googledrive: ImageVector
    get() {
        if (_googledrive != null) {
            return _googledrive!!
        }
        _googledrive = Builder(name = "Googledrive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 1.485f)
                curveToRelative(-2.082f, 0.0f, -3.754f, 0.02f, -3.743f, 0.047f)
                curveToRelative(0.01f, 0.02f, 1.708f, 3.001f, 3.774f, 6.62f)
                lineToRelative(3.76f, 6.574f)
                horizontalLineToRelative(3.76f)
                curveToRelative(2.081f, 0.0f, 3.753f, -0.02f, 3.742f, -0.047f)
                curveToRelative(-0.005f, -0.02f, -1.708f, -3.001f, -3.775f, -6.62f)
                lineToRelative(-3.76f, -6.574f)
                close()
                moveTo(7.25f, 3.215f)
                arcToRelative(789.828f, 789.861f, 0.0f, false, false, -3.63f, 6.319f)
                lineTo(0.0f, 15.868f)
                lineToRelative(1.89f, 3.298f)
                lineToRelative(1.885f, 3.297f)
                lineToRelative(3.62f, -6.335f)
                lineToRelative(3.618f, -6.33f)
                lineToRelative(-1.88f, -3.287f)
                curveTo(8.1f, 4.704f, 7.255f, 3.22f, 7.25f, 3.214f)
                close()
                moveTo(9.509f, 15.868f)
                lineTo(9.306f, 16.216f)
                curveToRelative(-0.114f, 0.198f, -0.96f, 1.672f, -1.88f, 3.287f)
                arcToRelative(423.93f, 423.948f, 0.0f, false, true, -1.698f, 2.97f)
                curveToRelative(-0.01f, 0.026f, 3.24f, 0.042f, 7.222f, 0.042f)
                horizontalLineToRelative(7.244f)
                lineToRelative(1.796f, -3.157f)
                curveToRelative(0.992f, -1.734f, 1.85f, -3.23f, 1.906f, -3.323f)
                lineToRelative(0.104f, -0.167f)
                horizontalLineToRelative(-7.249f)
                close()
            }
        }
        .build()
        return _googledrive!!
    }

private var _googledrive: ImageVector? = null
