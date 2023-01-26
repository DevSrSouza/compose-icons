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

public val OutlineGroup.SportsCricket: ImageVector
    get() {
        if (_sportsCricket != null) {
            return _sportsCricket!!
        }
        _sportsCricket = Builder(name = "SportsCricket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.04f, 12.79f)
                lineToRelative(-8.5f, -8.5f)
                curveTo(6.35f, 4.1f, 6.09f, 4.0f, 5.83f, 4.0f)
                reflectiveCurveTo(5.32f, 4.1f, 5.13f, 4.29f)
                lineTo(2.29f, 7.13f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f)
                lineToRelative(8.5f, 8.5f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.26f, 0.0f, 0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(2.83f, -2.83f)
                curveTo(15.43f, 13.82f, 15.43f, 13.18f, 15.04f, 12.79f)
                close()
                moveTo(11.5f, 14.92f)
                lineTo(4.41f, 7.83f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(7.09f, 7.09f)
                lineTo(11.5f, 14.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3412f, 17.7562f)
                lineToRelative(1.4142f, -1.4142f)
                lineToRelative(4.2426f, 4.2426f)
                lineToRelative(-1.4142f, 1.4142f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                curveTo(16.57f, 2.0f, 15.0f, 3.57f, 15.0f, 5.5f)
                curveTo(15.0f, 7.43f, 16.57f, 9.0f, 18.5f, 9.0f)
                reflectiveCurveTo(22.0f, 7.43f, 22.0f, 5.5f)
                curveTo(22.0f, 3.57f, 20.43f, 2.0f, 18.5f, 2.0f)
                close()
                moveTo(18.5f, 7.0f)
                curveTo(17.67f, 7.0f, 17.0f, 6.33f, 17.0f, 5.5f)
                reflectiveCurveTo(17.67f, 4.0f, 18.5f, 4.0f)
                reflectiveCurveTo(20.0f, 4.67f, 20.0f, 5.5f)
                reflectiveCurveTo(19.33f, 7.0f, 18.5f, 7.0f)
                close()
            }
        }
        .build()
        return _sportsCricket!!
    }

private var _sportsCricket: ImageVector? = null
