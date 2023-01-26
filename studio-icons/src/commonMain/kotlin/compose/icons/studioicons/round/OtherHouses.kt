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

public val RoundGroup.OtherHouses: ImageVector
    get() {
        if (_otherHouses != null) {
            return _otherHouses!!
        }
        _otherHouses = Builder(name = "OtherHouses", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.61f, 12.19f)
                curveToRelative(0.34f, 0.44f, 0.96f, 0.52f, 1.4f, 0.19f)
                lineTo(4.0f, 11.62f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-8.38f)
                lineToRelative(0.99f, 0.76f)
                curveToRelative(0.44f, 0.34f, 1.07f, 0.25f, 1.4f, -0.19f)
                curveToRelative(0.34f, -0.44f, 0.25f, -1.07f, -0.19f, -1.4f)
                lineToRelative(-9.6f, -7.33f)
                curveToRelative(-0.36f, -0.27f, -0.86f, -0.27f, -1.21f, 0.0f)
                lineToRelative(-9.6f, 7.33f)
                curveTo(1.36f, 11.13f, 1.27f, 11.76f, 1.61f, 12.19f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(9.0f, 14.55f, 8.55f, 15.0f, 8.0f, 15.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(13.0f, 14.55f, 12.55f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(17.0f, 14.55f, 16.55f, 15.0f, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _otherHouses!!
    }

private var _otherHouses: ImageVector? = null
