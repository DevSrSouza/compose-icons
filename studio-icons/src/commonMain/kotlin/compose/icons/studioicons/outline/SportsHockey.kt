package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SportsHockey: ImageVector
    get() {
        if (_sportsHockey != null) {
            return _sportsHockey!!
        }
        _sportsHockey = Builder(name = "SportsHockey", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 16.0f, 2.0f, 16.45f, 2.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.69f, -0.01f)
                curveToRelative(0.38f, 0.0f, 0.72f, -0.21f, 0.89f, -0.55f)
                lineToRelative(0.87f, -1.9f)
                lineToRelative(-1.59f, -3.48f)
                lineTo(9.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.71f, 16.29f)
                curveTo(21.53f, 16.11f, 21.28f, 16.0f, 21.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(2.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                curveTo(22.0f, 16.72f, 21.89f, 16.47f, 21.71f, 16.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.6f, 12.84f)
                lineTo(17.65f, 4.0f)
                horizontalLineTo(14.3f)
                lineToRelative(-1.76f, 3.97f)
                lineToRelative(-0.49f, 1.1f)
                lineTo(12.0f, 9.21f)
                lineTo(9.7f, 4.0f)
                horizontalLineTo(6.35f)
                lineToRelative(4.05f, 8.84f)
                lineToRelative(1.52f, 3.32f)
                lineTo(12.0f, 16.34f)
                lineToRelative(1.42f, 3.1f)
                curveToRelative(0.17f, 0.34f, 0.51f, 0.55f, 0.89f, 0.55f)
                lineTo(19.0f, 20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.6f, 12.84f)
                close()
            }
        }
        .build()
        return _sportsHockey!!
    }

private var _sportsHockey: ImageVector? = null
