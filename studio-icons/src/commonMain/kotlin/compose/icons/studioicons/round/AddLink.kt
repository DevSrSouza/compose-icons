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

public val RoundGroup.AddLink: ImageVector
    get() {
        if (_addLink != null) {
            return _addLink!!
        }
        _addLink = Builder(name = "AddLink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveTo(8.0f, 11.45f, 8.45f, 11.0f, 9.0f, 11.0f)
                close()
                moveTo(20.93f, 12.0f)
                lineTo(20.93f, 12.0f)
                curveToRelative(0.62f, 0.0f, 1.07f, -0.59f, 0.93f, -1.19f)
                curveTo(21.32f, 8.62f, 19.35f, 7.0f, 17.0f, 7.0f)
                horizontalLineToRelative(-3.05f)
                curveTo(13.43f, 7.0f, 13.0f, 7.43f, 13.0f, 7.95f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.52f, 0.43f, 0.95f, 0.95f, 0.95f)
                horizontalLineTo(17.0f)
                curveToRelative(1.45f, 0.0f, 2.67f, 1.0f, 3.01f, 2.34f)
                curveTo(20.12f, 11.68f, 20.48f, 12.0f, 20.93f, 12.0f)
                close()
                moveTo(3.96f, 11.38f)
                curveTo(4.24f, 9.91f, 5.62f, 8.9f, 7.12f, 8.9f)
                lineToRelative(2.93f, 0.0f)
                curveTo(10.57f, 8.9f, 11.0f, 8.47f, 11.0f, 7.95f)
                verticalLineToRelative(0.0f)
                curveTo(11.0f, 7.43f, 10.57f, 7.0f, 10.05f, 7.0f)
                lineTo(7.22f, 7.0f)
                curveToRelative(-2.61f, 0.0f, -4.94f, 1.91f, -5.19f, 4.51f)
                curveTo(1.74f, 14.49f, 4.08f, 17.0f, 7.0f, 17.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.52f, -0.43f, -0.95f, -0.95f, -0.95f)
                horizontalLineTo(7.0f)
                curveTo(5.09f, 15.1f, 3.58f, 13.36f, 3.96f, 11.38f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                curveTo(19.0f, 12.45f, 18.55f, 12.0f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _addLink!!
    }

private var _addLink: ImageVector? = null
