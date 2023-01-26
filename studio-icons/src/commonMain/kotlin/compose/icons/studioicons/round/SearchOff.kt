package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SearchOff: ImageVector
    get() {
        if (_searchOff != null) {
            return _searchOff!!
        }
        _searchOff = Builder(name = "SearchOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 14.0f)
                horizontalLineToRelative(-0.79f)
                lineToRelative(-0.28f, -0.27f)
                curveToRelative(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f)
                curveToRelative(-0.47f, -2.78f, -2.79f, -4.99f, -5.58f, -5.34f)
                curveTo(6.54f, 2.58f, 3.3f, 5.38f, 3.03f, 9.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.24f, -2.12f, 1.92f, -3.8f, 4.06f, -3.98f)
                curveTo(11.65f, 4.8f, 14.0f, 6.95f, 14.0f, 9.5f)
                curveToRelative(0.0f, 2.49f, -2.01f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f)
                lineToRelative(0.0f, 2.02f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, 0.01f)
                curveToRelative(1.8f, 0.13f, 3.47f, -0.47f, 4.72f, -1.55f)
                lineTo(14.0f, 14.71f)
                verticalLineToRelative(0.79f)
                lineToRelative(4.25f, 4.25f)
                curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f)
                lineTo(15.5f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.12f, 11.17f)
                lineTo(4.0f, 13.29f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f)
                lineTo(3.29f, 14.0f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineTo(4.0f, 14.71f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                lineTo(4.71f, 14.0f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                lineToRelative(0.0f, 0.0f)
                curveTo(6.63f, 10.98f, 6.32f, 10.98f, 6.12f, 11.17f)
                close()
            }
        }
        .build()
        return _searchOff!!
    }

private var _searchOff: ImageVector? = null
