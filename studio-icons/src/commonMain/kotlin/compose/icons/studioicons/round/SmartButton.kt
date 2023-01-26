package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SmartButton: ImageVector
    get() {
        if (_smartButton != null) {
            return _smartButton!!
        }
        _smartButton = Builder(name = "SmartButton", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveTo(21.1f, 7.0f, 22.0f, 7.9f, 22.0f, 9.0f)
                close()
                moveTo(14.04f, 17.99f)
                curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f)
                lineToRelative(0.63f, -1.4f)
                lineToRelative(1.4f, -0.63f)
                curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(-1.4f, -0.63f)
                lineToRelative(-0.63f, -1.4f)
                curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f)
                lineToRelative(-0.63f, 1.4f)
                lineToRelative(-1.4f, 0.63f)
                curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(1.4f, 0.63f)
                lineTo(14.04f, 17.99f)
                close()
                moveTo(16.74f, 13.43f)
                curveToRelative(0.1f, 0.22f, 0.42f, 0.22f, 0.52f, 0.0f)
                lineToRelative(0.36f, -0.8f)
                lineToRelative(0.8f, -0.36f)
                curveToRelative(0.22f, -0.1f, 0.22f, -0.42f, 0.0f, -0.52f)
                lineToRelative(-0.8f, -0.36f)
                lineToRelative(-0.36f, -0.8f)
                curveToRelative(-0.1f, -0.22f, -0.42f, -0.22f, -0.52f, 0.0f)
                lineToRelative(-0.36f, 0.8f)
                lineToRelative(-0.8f, 0.36f)
                curveToRelative(-0.22f, 0.1f, -0.22f, 0.42f, 0.0f, 0.52f)
                lineToRelative(0.8f, 0.36f)
                lineTo(16.74f, 13.43f)
                close()
            }
        }
        .build()
        return _smartButton!!
    }

private var _smartButton: ImageVector? = null