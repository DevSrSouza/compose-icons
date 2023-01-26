package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.GasMeter: ImageVector
    get() {
        if (_gasMeter != null) {
            return _gasMeter!!
        }
        _gasMeter = Builder(name = "GasMeter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineTo(8.0f)
                curveTo(20.0f, 5.79f, 18.21f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.1f, -2.5f, -2.46f)
                curveToRelative(0.0f, -1.09f, 0.43f, -1.39f, 2.5f, -3.79f)
                curveToRelative(2.05f, 2.38f, 2.5f, 2.7f, 2.5f, 3.79f)
                curveTo(14.5f, 16.9f, 13.38f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(16.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _gasMeter!!
    }

private var _gasMeter: ImageVector? = null
