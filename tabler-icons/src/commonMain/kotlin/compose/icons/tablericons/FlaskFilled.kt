package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.FlaskFilled: ImageVector
    get() {
        if (_flaskFilled != null) {
            return _flaskFilled!!
        }
        _flaskFilled = Builder(name = "FlaskFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                verticalLineToRelative(4.826f)
                lineToRelative(3.932f, 10.814f)
                lineToRelative(0.034f, 0.077f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -0.002f, 1.193f)
                lineToRelative(-0.07f, 0.162f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.213f, 0.911f)
                lineToRelative(-0.181f, 0.017f)
                horizontalLineToRelative(-11.0f)
                lineToRelative(-0.181f, -0.017f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.285f, -2.266f)
                lineToRelative(0.039f, -0.09f)
                lineToRelative(3.927f, -10.804f)
                verticalLineToRelative(-4.823f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _flaskFilled!!
    }

private var _flaskFilled: ImageVector? = null
