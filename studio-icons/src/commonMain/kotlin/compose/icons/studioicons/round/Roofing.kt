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

public val RoundGroup.Roofing: ImageVector
    get() {
        if (_roofing != null) {
            return _roofing!!
        }
        _roofing = Builder(name = "Roofing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(9.0f, 15.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(9.45f, 14.0f, 9.0f, 14.45f, 9.0f, 15.0f)
                close()
                moveTo(19.0f, 9.3f)
                lineTo(19.0f, 9.3f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.6f)
                verticalLineToRelative(0.0f)
                lineToRelative(-3.33f, -3.0f)
                curveToRelative(-0.38f, -0.34f, -0.96f, -0.34f, -1.34f, 0.0f)
                lineToRelative(-8.36f, 7.53f)
                curveTo(2.63f, 11.43f, 2.84f, 12.0f, 3.3f, 12.0f)
                horizontalLineToRelative(1.31f)
                curveToRelative(0.25f, 0.0f, 0.49f, -0.09f, 0.67f, -0.26f)
                lineTo(12.0f, 5.69f)
                lineToRelative(6.71f, 6.05f)
                curveTo(18.9f, 11.91f, 19.14f, 12.0f, 19.38f, 12.0f)
                horizontalLineToRelative(1.31f)
                curveToRelative(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f)
                lineTo(19.0f, 9.3f)
                close()
            }
        }
        .build()
        return _roofing!!
    }

private var _roofing: ImageVector? = null
