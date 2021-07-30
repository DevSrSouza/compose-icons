package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.0f, 448.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(608.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(80.55f, 341.27f)
                curveToRelative(6.28f, 6.84f, 15.1f, 10.72f, 24.33f, 10.71f)
                lineToRelative(130.54f, -0.18f)
                arcToRelative(65.62f, 65.62f, 0.0f, false, false, 29.64f, -7.12f)
                lineToRelative(290.96f, -147.65f)
                curveToRelative(26.74f, -13.57f, 50.71f, -32.94f, 67.02f, -58.31f)
                curveToRelative(18.31f, -28.48f, 20.3f, -49.09f, 13.07f, -63.65f)
                curveToRelative(-7.21f, -14.57f, -24.74f, -25.27f, -58.25f, -27.45f)
                curveToRelative(-29.85f, -1.94f, -59.54f, 5.92f, -86.28f, 19.48f)
                lineToRelative(-98.51f, 49.99f)
                lineToRelative(-218.7f, -82.06f)
                arcToRelative(17.799f, 17.799f, 0.0f, false, false, -18.0f, -1.11f)
                lineTo(90.62f, 67.29f)
                curveToRelative(-10.67f, 5.41f, -13.25f, 19.65f, -5.17f, 28.53f)
                lineToRelative(156.22f, 98.1f)
                lineToRelative(-103.21f, 52.38f)
                lineToRelative(-72.35f, -36.47f)
                arcToRelative(17.804f, 17.804f, 0.0f, false, false, -16.07f, 0.02f)
                lineTo(9.91f, 230.22f)
                curveToRelative(-10.44f, 5.3f, -13.19f, 19.12f, -5.57f, 28.08f)
                lineToRelative(76.21f, 82.97f)
                close()
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
