package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Heroku: ImageVector
    get() {
        if (_heroku != null) {
            return _heroku!!
        }
        _heroku = Builder(name = "Heroku", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.61f, 0.0f)
                lineTo(3.39f, 0.0f)
                curveTo(2.189f, 0.0f, 1.23f, 0.96f, 1.23f, 2.16f)
                verticalLineToRelative(19.681f)
                curveToRelative(0.0f, 1.198f, 0.959f, 2.159f, 2.16f, 2.159f)
                horizontalLineToRelative(17.22f)
                curveToRelative(1.2f, 0.0f, 2.159f, -0.961f, 2.159f, -2.159f)
                lineTo(22.769f, 2.16f)
                curveTo(22.77f, 0.96f, 21.811f, 0.0f, 20.61f, 0.0f)
                close()
                moveTo(21.57f, 21.841f)
                curveToRelative(0.0f, 0.539f, -0.421f, 0.96f, -0.96f, 0.96f)
                lineTo(3.39f, 22.801f)
                curveToRelative(-0.54f, 0.0f, -0.96f, -0.421f, -0.96f, -0.96f)
                lineTo(2.43f, 2.16f)
                curveToRelative(0.0f, -0.54f, 0.42f, -0.961f, 0.96f, -0.961f)
                horizontalLineToRelative(17.22f)
                curveToRelative(0.539f, 0.0f, 0.96f, 0.421f, 0.96f, 0.961f)
                verticalLineToRelative(19.681f)
                close()
                moveTo(6.63f, 20.399f)
                lineTo(9.33f, 18.0f)
                lineToRelative(-2.7f, -2.4f)
                verticalLineToRelative(4.799f)
                close()
                moveTo(16.35f, 10.68f)
                curveToRelative(-0.479f, -0.48f, -1.379f, -1.08f, -2.879f, -1.08f)
                curveToRelative(-1.621f, 0.0f, -3.301f, 0.421f, -4.5f, 0.84f)
                lineTo(8.971f, 3.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(10.38f)
                lineToRelative(1.68f, -0.78f)
                reflectiveCurveToRelative(2.76f, -1.26f, 5.16f, -1.26f)
                curveToRelative(1.2f, 0.0f, 1.5f, 0.66f, 1.5f, 1.26f)
                verticalLineToRelative(7.2f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-7.2f)
                curveToRelative(0.059f, -0.179f, 0.059f, -1.501f, -0.961f, -2.52f)
                close()
                moveTo(13.17f, 7.5f)
                horizontalLineToRelative(2.4f)
                curveToRelative(1.08f, -1.26f, 1.62f, -2.521f, 1.8f, -3.9f)
                horizontalLineToRelative(-2.399f)
                curveToRelative(-0.241f, 1.379f, -0.841f, 2.64f, -1.801f, 3.9f)
                close()
            }
        }
        .build()
        return _heroku!!
    }

private var _heroku: ImageVector? = null
