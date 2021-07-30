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
                curveToRelative(-22.092f, 0.0f, -40.0f, 17.909f, -40.0f, 40.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -22.091f, -17.908f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.909f, -40.0f, 40.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(208.0f)
                horizontalLineToRelative(-13.572f)
                lineTo(92.688f, 78.449f)
                curveTo(82.994f, 53.774f, 55.134f, 41.63f, 30.461f, 51.324f)
                curveTo(5.787f, 61.017f, -6.356f, 88.877f, 3.337f, 113.551f)
                lineToRelative(74.765f, 190.342f)
                lineToRelative(-31.09f, 24.872f)
                curveToRelative(-15.381f, 12.306f, -19.515f, 33.978f, -9.741f, 51.081f)
                lineToRelative(64.0f, 112.0f)
                arcTo(39.998f, 39.998f, 0.0f, false, false, 136.0f, 512.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(18.562f, 0.0f, 34.686f, -12.77f, 38.937f, -30.838f)
                lineToRelative(32.0f, -136.0f)
                arcTo(39.97f, 39.97f, 0.0f, false, false, 448.0f, 336.0f)
                verticalLineToRelative(-80.0f)
                curveToRelative(0.0f, -22.091f, -17.908f, -40.0f, -40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
