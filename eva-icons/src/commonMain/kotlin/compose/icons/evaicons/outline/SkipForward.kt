package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.SkipForward: ImageVector
    get() {
        if (_skipForward != null) {
            return _skipForward!!
        }
        _skipForward = Builder(name = "SkipForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.82f)
                lineToRelative(-0.14f, -0.15f)
                lineTo(9.76f, 6.46f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 7.55f, 6.2f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -1.0f, 1.59f)
                verticalLineToRelative(8.42f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, 1.0f, 1.59f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, 0.91f, 0.2f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, false, 1.3f, -0.46f)
                lineToRelative(5.1f, -4.21f)
                lineToRelative(0.14f, -0.15f)
                verticalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 6.0f)
                close()
                moveTo(8.5f, 15.91f)
                verticalLineTo(8.0f)
                lineToRelative(4.82f, 4.0f)
                close()
            }
        }
        .build()
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
