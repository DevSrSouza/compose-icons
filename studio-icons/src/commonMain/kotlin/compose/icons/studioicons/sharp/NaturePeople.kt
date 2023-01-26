package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NaturePeople: ImageVector
    get() {
        if (_naturePeople != null) {
            return _naturePeople!!
        }
        _naturePeople = Builder(name = "NaturePeople", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.17f, 9.17f)
                curveToRelative(0.0f, -3.91f, -3.19f, -7.06f, -7.11f, -7.0f)
                curveToRelative(-3.83f, 0.06f, -6.99f, 3.37f, -6.88f, 7.19f)
                curveToRelative(0.09f, 3.38f, 2.58f, 6.16f, 5.83f, 6.7f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.88f)
                curveToRelative(3.47f, -0.41f, 6.17f, -3.36f, 6.17f, -6.95f)
                close()
                moveTo(4.5f, 11.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(5.33f, 8.0f, 4.5f, 8.0f)
                reflectiveCurveTo(3.0f, 8.67f, 3.0f, 9.5f)
                reflectiveCurveTo(3.67f, 11.0f, 4.5f, 11.0f)
                close()
            }
        }
        .build()
        return _naturePeople!!
    }

private var _naturePeople: ImageVector? = null
