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

public val RoundGroup.GeneratingTokens: ImageVector
    get() {
        if (_generatingTokens != null) {
            return _generatingTokens!!
        }
        _generatingTokens = Builder(name = "GeneratingTokens", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                curveTo(17.0f, 7.58f, 13.42f, 4.0f, 9.0f, 4.0f)
                close()
                moveTo(9.0f, 15.5f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(6.75f)
                curveTo(6.34f, 10.5f, 6.0f, 10.16f, 6.0f, 9.75f)
                reflectiveCurveTo(6.34f, 9.0f, 6.75f, 9.0f)
                horizontalLineToRelative(4.5f)
                curveTo(11.66f, 9.0f, 12.0f, 9.34f, 12.0f, 9.75f)
                reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(4.0f)
                curveTo(10.0f, 15.05f, 9.55f, 15.5f, 9.0f, 15.5f)
                close()
                moveTo(20.25f, 3.75f)
                lineTo(22.0f, 4.54f)
                curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(-1.75f, 0.79f)
                lineTo(19.46f, 8.0f)
                curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f)
                lineToRelative(-0.79f, -1.75f)
                lineTo(16.0f, 5.46f)
                curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(1.75f, -0.79f)
                lineTo(18.54f, 2.0f)
                curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f)
                lineTo(20.25f, 3.75f)
                close()
                moveTo(20.25f, 17.75f)
                lineTo(22.0f, 18.54f)
                curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(-1.75f, 0.79f)
                lineTo(19.46f, 22.0f)
                curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f)
                lineToRelative(-0.79f, -1.75f)
                lineTo(16.0f, 19.46f)
                curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(1.75f, -0.79f)
                lineTo(18.54f, 16.0f)
                curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f)
                lineTo(20.25f, 17.75f)
                close()
            }
        }
        .build()
        return _generatingTokens!!
    }

private var _generatingTokens: ImageVector? = null
