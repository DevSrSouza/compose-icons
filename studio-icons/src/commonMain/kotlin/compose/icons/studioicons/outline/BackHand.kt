package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.BackHand: ImageVector
    get() {
        if (_backHand != null) {
            return _backHand!!
        }
        _backHand = Builder(name = "BackHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.23f, 0.0f, -0.46f, 0.03f, -0.67f, 0.09f)
                curveTo(14.46f, 0.66f, 13.56f, 0.0f, 12.5f, 0.0f)
                curveToRelative(-1.23f, 0.0f, -2.25f, 0.89f, -2.46f, 2.06f)
                curveTo(9.87f, 2.02f, 9.69f, 2.0f, 9.5f, 2.0f)
                curveTo(8.12f, 2.0f, 7.0f, 3.12f, 7.0f, 4.5f)
                verticalLineToRelative(5.89f)
                curveToRelative(-0.34f, -0.31f, -0.76f, -0.54f, -1.22f, -0.66f)
                lineTo(5.01f, 9.52f)
                curveToRelative(-0.83f, -0.23f, -1.7f, 0.09f, -2.19f, 0.83f)
                curveToRelative(-0.38f, 0.57f, -0.4f, 1.31f, -0.15f, 1.95f)
                lineToRelative(2.56f, 6.43f)
                curveTo(6.49f, 21.91f, 9.57f, 24.0f, 13.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.61f, 0.0f, -4.95f, -1.59f, -5.91f, -4.01f)
                lineToRelative(-2.6f, -6.54f)
                lineToRelative(0.53f, 0.14f)
                curveToRelative(0.46f, 0.12f, 0.83f, 0.46f, 1.0f, 0.9f)
                lineTo(7.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.5f)
                curveTo(9.0f, 4.22f, 9.22f, 4.0f, 9.5f, 4.0f)
                reflectiveCurveTo(10.0f, 4.22f, 10.0f, 4.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f)
                reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(16.0f, 3.72f, 16.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveTo(19.0f, 6.72f, 19.0f, 7.0f)
                lineTo(19.0f, 16.0f)
                close()
            }
        }
        .build()
        return _backHand!!
    }

private var _backHand: ImageVector? = null
