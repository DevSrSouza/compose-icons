package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandPeace: ImageVector
    get() {
        if (_handPeace != null) {
            return _handPeace!!
        }
        _handPeace = Builder(name = "HandPeace", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 216.0f)
                curveToRelative(-22.09f, 0.0f, -40.0f, 17.91f, -40.0f, 40.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -22.09f, -17.91f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.91f, -40.0f, 40.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(208.0f)
                horizontalLineToRelative(-13.57f)
                lineTo(92.69f, 78.45f)
                curveTo(82.99f, 53.77f, 55.13f, 41.63f, 30.46f, 51.32f)
                curveTo(5.79f, 61.02f, -6.36f, 88.88f, 3.34f, 113.55f)
                lineToRelative(74.76f, 190.34f)
                lineToRelative(-31.09f, 24.87f)
                curveToRelative(-15.38f, 12.31f, -19.51f, 33.98f, -9.74f, 51.08f)
                lineToRelative(64.0f, 112.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 136.0f, 512.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(18.56f, 0.0f, 34.69f, -12.77f, 38.94f, -30.84f)
                lineToRelative(32.0f, -136.0f)
                arcTo(39.97f, 39.97f, 0.0f, false, false, 448.0f, 336.0f)
                verticalLineToRelative(-80.0f)
                curveToRelative(0.0f, -22.09f, -17.91f, -40.0f, -40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
