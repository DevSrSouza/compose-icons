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

public val RoundGroup.Gite: ImageVector
    get() {
        if (_gite != null) {
            return _gite!!
        }
        _gite = Builder(name = "Gite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 9.41f)
                lineToRelative(-2.83f, -2.83f)
                curveTo(18.21f, 6.21f, 17.7f, 6.0f, 17.17f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(7.0f, 4.45f, 7.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.83f)
                curveTo(6.3f, 6.0f, 5.79f, 6.21f, 5.41f, 6.59f)
                lineTo(2.59f, 9.41f)
                curveTo(2.21f, 9.79f, 2.0f, 10.3f, 2.0f, 10.83f)
                verticalLineTo(17.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-6.17f)
                curveTo(22.0f, 10.3f, 21.79f, 9.79f, 21.41f, 9.41f)
                close()
                moveTo(14.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-6.17f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _gite!!
    }

private var _gite: ImageVector? = null
