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

public val SimpleIcons.Gsmarenadotcom: ImageVector
    get() {
        if (_gsmarenadotcom != null) {
            return _gsmarenadotcom!!
        }
        _gsmarenadotcom = Builder(name = "Gsmarenadotcom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.324f, 22.992f)
                curveToRelative(-0.905f, -0.454f, -12.625f, -5.27f, -12.625f, -5.27f)
                arcToRelative(1.275f, 1.275f, 0.0f, false, false, -0.389f, -0.122f)
                curveToRelative(-0.39f, -0.056f, -0.78f, 0.091f, -1.061f, 0.444f)
                curveToRelative(0.0f, 0.0f, -2.672f, 4.354f, -3.066f, 4.948f)
                curveTo(2.782f, 23.58f, 3.2f, 24.0f, 3.726f, 24.0f)
                horizontalLineToRelative(16.38f)
                curveToRelative(0.644f, 0.0f, 0.898f, -0.67f, 0.218f, -1.008f)
                close()
                moveTo(19.688f, 0.0f)
                horizontalLineToRelative(-7.743f)
                curveToRelative(-0.868f, 0.0f, -1.49f, 0.28f, -2.042f, 1.043f)
                lineTo(4.05f, 10.497f)
                curveToRelative(-0.333f, 0.457f, -0.14f, 0.985f, 0.336f, 1.185f)
                curveToRelative(0.974f, 0.412f, 2.766f, 0.977f, 3.68f, 1.388f)
                curveToRelative(0.718f, 0.326f, 1.157f, 0.204f, 1.552f, -0.382f)
                lineToRelative(4.092f, -6.507f)
                lineToRelative(0.49f, -0.005f)
                verticalLineToRelative(7.405f)
                curveToRelative(0.0f, 0.924f, 0.37f, 1.279f, 0.946f, 1.54f)
                curveToRelative(0.577f, 0.246f, 4.144f, 1.773f, 4.689f, 1.973f)
                curveToRelative(0.644f, 0.246f, 1.143f, -0.05f, 1.143f, -0.731f)
                verticalLineTo(1.289f)
                curveToRelative(0.0f, -0.706f, -0.585f, -1.289f, -1.29f, -1.289f)
                close()
            }
        }
        .build()
        return _gsmarenadotcom!!
    }

private var _gsmarenadotcom: ImageVector? = null
