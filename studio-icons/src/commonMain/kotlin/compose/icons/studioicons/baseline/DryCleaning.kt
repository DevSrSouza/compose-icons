package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.DryCleaning: ImageVector
    get() {
        if (_dryCleaning != null) {
            return _dryCleaning!!
        }
        _dryCleaning = Builder(name = "DryCleaning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.56f, 11.36f)
                lineTo(13.0f, 8.44f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.84f, -1.66f, -3.3f, -3.56f, -2.95f)
                curveTo(10.26f, 2.27f, 9.29f, 3.22f, 9.06f, 4.4f)
                curveTo(8.76f, 5.96f, 9.66f, 7.34f, 11.0f, 7.82f)
                verticalLineToRelative(0.63f)
                lineToRelative(-6.56f, 2.92f)
                curveTo(3.56f, 11.75f, 3.0f, 12.62f, 3.0f, 13.57f)
                verticalLineToRelative(0.01f)
                curveTo(3.0f, 14.92f, 4.08f, 16.0f, 5.42f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.58f)
                curveToRelative(1.34f, 0.0f, 2.42f, -1.08f, 2.42f, -2.42f)
                verticalLineToRelative(-0.01f)
                curveTo(21.0f, 12.62f, 20.44f, 11.75f, 19.56f, 11.36f)
                close()
                moveTo(18.58f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.42f)
                curveTo(5.19f, 14.0f, 5.0f, 13.81f, 5.0f, 13.57f)
                curveToRelative(0.0f, -0.17f, 0.1f, -0.32f, 0.25f, -0.38f)
                lineToRelative(6.75f, -3.0f)
                lineToRelative(6.75f, 3.0f)
                curveTo(18.9f, 13.26f, 19.0f, 13.41f, 19.0f, 13.58f)
                curveTo(19.0f, 13.81f, 18.81f, 14.0f, 18.58f, 14.0f)
                close()
            }
        }
        .build()
        return _dryCleaning!!
    }

private var _dryCleaning: ImageVector? = null
