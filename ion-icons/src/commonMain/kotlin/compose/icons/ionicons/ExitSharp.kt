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

public val IonIcons.ExitSharp: ImageVector
    get() {
        if (_exitSharp != null) {
            return _exitSharp!!
        }
        _exitSharp = Builder(name = "ExitSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(335.69f, 272.0f)
                horizontalLineToRelative(-161.0f)
                verticalLineTo(240.0f)
                horizontalLineToRelative(161.0f)
                verticalLineTo(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-280.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineTo(420.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(280.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(419.06f, 272.0f)
                lineToRelative(-64.0f, 64.0f)
                lineToRelative(22.63f, 22.63f)
                lineToRelative(102.62f, -102.63f)
                lineToRelative(-102.62f, -102.63f)
                lineToRelative(-22.63f, 22.63f)
                lineToRelative(64.0f, 64.0f)
                lineToRelative(-83.37f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(83.37f, 0.0f)
                close()
            }
        }
        .build()
        return _exitSharp!!
    }

private var _exitSharp: ImageVector? = null
