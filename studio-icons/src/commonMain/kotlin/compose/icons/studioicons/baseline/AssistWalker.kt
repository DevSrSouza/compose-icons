package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.AssistWalker: ImageVector
    get() {
        if (_assistWalker != null) {
            return _assistWalker!!
        }
        _assistWalker = Builder(name = "AssistWalker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 4.5f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.77f, 17.72f)
                lineToRelative(-0.64f, -6.37f)
                curveTo(19.06f, 10.58f, 18.41f, 10.0f, 17.64f, 10.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-1.5f, -0.02f, -2.86f, -0.54f, -3.76f, -1.44f)
                lineToRelative(-2.0f, -1.98f)
                curveTo(10.08f, 6.42f, 9.62f, 6.0f, 8.83f, 6.0f)
                curveTo(8.32f, 6.0f, 7.81f, 6.2f, 7.42f, 6.59f)
                lineTo(4.08f, 9.91f)
                curveToRelative(-0.53f, 0.68f, -0.51f, 1.57f, -0.21f, 2.13f)
                lineToRelative(1.43f, 2.8f)
                lineToRelative(-3.15f, 4.05f)
                lineToRelative(1.57f, 1.24f)
                lineToRelative(3.68f, -4.73f)
                lineToRelative(-0.17f, -1.36f)
                lineTo(8.0f, 14.75f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.36f, -2.36f)
                curveToRelative(0.94f, 0.94f, 1.72f, 1.82f, 3.59f, 2.32f)
                lineTo(13.0f, 20.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.41f, -3.5f)
                horizontalLineToRelative(3.18f)
                lineToRelative(0.14f, 1.22f)
                curveToRelative(-0.44f, 0.26f, -0.73f, 0.74f, -0.73f, 1.28f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveTo(20.5f, 18.46f, 20.21f, 17.98f, 19.77f, 17.72f)
                close()
                moveTo(15.09f, 15.0f)
                lineToRelative(0.41f, -3.5f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.41f, 3.5f)
                horizontalLineTo(15.09f)
                close()
            }
        }
        .build()
        return _assistWalker!!
    }

private var _assistWalker: ImageVector? = null
