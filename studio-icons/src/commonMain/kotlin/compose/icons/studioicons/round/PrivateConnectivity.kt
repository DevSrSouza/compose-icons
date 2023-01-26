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

public val RoundGroup.PrivateConnectivity: ImageVector
    get() {
        if (_privateConnectivity != null) {
            return _privateConnectivity!!
        }
        _privateConnectivity = Builder(name = "PrivateConnectivity", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.07f)
                curveToRelative(-0.49f, -3.39f, -3.4f, -6.0f, -6.93f, -6.0f)
                reflectiveCurveToRelative(-6.44f, 2.61f, -6.93f, 6.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.49f, 3.39f, 3.4f, 6.0f, 6.93f, 6.0f)
                reflectiveCurveToRelative(6.44f, -2.61f, 6.93f, -6.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 13.0f, 22.0f, 12.55f, 22.0f, 12.0f)
                close()
                moveTo(15.0f, 14.5f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.21f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveTo(13.32f, 7.69f, 14.0f, 8.61f, 14.0f, 9.61f)
                verticalLineToRelative(0.89f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.75f, 13.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveTo(12.75f, 12.59f, 12.75f, 13.0f)
                close()
                moveTo(13.0f, 9.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveTo(13.0f, 8.95f, 13.0f, 9.5f)
                close()
            }
        }
        .build()
        return _privateConnectivity!!
    }

private var _privateConnectivity: ImageVector? = null
