package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SportsMotorsports: ImageVector
    get() {
        if (_sportsMotorsports != null) {
            return _sportsMotorsports!!
        }
        _sportsMotorsports = Builder(name = "SportsMotorsports", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.39f)
                curveToRelative(0.0f, -0.65f, -0.39f, -1.23f, -0.98f, -1.48f)
                lineTo(5.44f, 7.55f)
                curveToRelative(-1.48f, 1.68f, -2.32f, 3.7f, -2.8f, 5.45f)
                horizontalLineToRelative(7.75f)
                curveTo(11.28f, 13.0f, 12.0f, 12.28f, 12.0f, 11.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.96f, 11.22f)
                curveToRelative(-0.41f, -4.41f, -4.56f, -7.49f, -8.98f, -7.2f)
                curveToRelative(-2.51f, 0.16f, -4.44f, 0.94f, -5.93f, 2.04f)
                lineToRelative(4.74f, 2.01f)
                curveToRelative(1.33f, 0.57f, 2.2f, 1.87f, 2.2f, 3.32f)
                curveToRelative(0.0f, 1.99f, -1.62f, 3.61f, -3.61f, 3.61f)
                horizontalLineTo(2.21f)
                curveTo(2.0f, 16.31f, 2.0f, 17.2f, 2.0f, 17.2f)
                verticalLineTo(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveTo(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f)
                close()
            }
        }
        .build()
        return _sportsMotorsports!!
    }

private var _sportsMotorsports: ImageVector? = null
