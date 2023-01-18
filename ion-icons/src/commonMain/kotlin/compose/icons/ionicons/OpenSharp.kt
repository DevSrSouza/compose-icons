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

public val IonIcons.OpenSharp: ImageVector
    get() {
        if (_openSharp != null) {
            return _openSharp!!
        }
        _openSharp = Builder(name = "OpenSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.37f, 288.0f)
                lineToRelative(176.0f, -176.0f)
                lineToRelative(-329.37f, 0.0f)
                lineToRelative(0.0f, 352.0f)
                lineToRelative(352.0f, 0.0f)
                lineToRelative(0.0f, -329.37f)
                lineToRelative(-176.0f, 176.0f)
                lineToRelative(-22.63f, -22.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 48.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(89.37f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                lineToRelative(22.63f, 22.63f)
                lineToRelative(32.0f, -32.0f)
                lineToRelative(0.0f, 89.37f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -144.0f)
                lineToRelative(-144.0f, 0.0f)
                close()
            }
        }
        .build()
        return _openSharp!!
    }

private var _openSharp: ImageVector? = null
