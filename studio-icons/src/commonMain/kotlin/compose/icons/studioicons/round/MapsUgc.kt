package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val RoundGroup.MapsUgc: ImageVector
    get() {
        if (_mapsUgc != null) {
            return _mapsUgc!!
        }
        _mapsUgc = Builder(name = "MapsUgc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.97f, 0.0f, 8.9f, 4.56f, 7.82f, 9.72f)
                curveToRelative(-0.68f, 3.23f, -3.4f, 5.74f, -6.67f, 6.2f)
                curveToRelative(-1.59f, 0.22f, -3.14f, -0.01f, -4.58f, -0.7f)
                curveToRelative(-0.27f, -0.13f, -0.56f, -0.19f, -0.86f, -0.19f)
                curveToRelative(-0.19f, 0.0f, -0.38f, 0.03f, -0.56f, 0.08f)
                lineToRelative(-2.31f, 0.68f)
                curveToRelative(-0.38f, 0.11f, -0.74f, -0.24f, -0.63f, -0.63f)
                lineToRelative(0.7f, -2.39f)
                curveToRelative(0.13f, -0.45f, 0.07f, -0.92f, -0.14f, -1.35f)
                curveTo(4.26f, 14.34f, 4.0f, 13.18f, 4.0f, 12.0f)
                curveTo(4.0f, 7.59f, 7.59f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.54f, 0.36f, 2.98f, 0.97f, 4.29f)
                lineToRelative(-1.46f, 4.96f)
                curveTo(1.29f, 22.0f, 2.0f, 22.71f, 2.76f, 22.48f)
                lineToRelative(4.96f, -1.46f)
                curveToRelative(1.66f, 0.79f, 3.56f, 1.15f, 5.58f, 0.89f)
                curveToRelative(4.56f, -0.59f, 8.21f, -4.35f, 8.66f, -8.92f)
                curveTo(22.53f, 7.03f, 17.85f, 2.0f, 12.0f, 2.0f)
                lineTo(12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
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
                verticalLineTo(9.0f)
                curveTo(13.0f, 8.45f, 12.55f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _mapsUgc!!
    }

private var _mapsUgc: ImageVector? = null
