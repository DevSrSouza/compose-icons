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

public val SimpleIcons.Microeditor: ImageVector
    get() {
        if (_microeditor != null) {
            return _microeditor!!
        }
        _microeditor = Builder(name = "Microeditor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.698f, 13.628f)
                curveToRelative(-0.117f, 0.465f, -0.303f, 0.837f, -0.558f, 1.14f)
                curveToRelative(-0.233f, 0.302f, -0.466f, 0.488f, -0.721f, 0.58f)
                curveToRelative(-0.256f, 0.094f, -0.512f, 0.14f, -0.791f, 0.14f)
                curveToRelative(-0.28f, 0.0f, -0.512f, -0.046f, -0.698f, -0.162f)
                curveToRelative(-0.186f, -0.093f, -0.325f, -0.256f, -0.442f, -0.442f)
                arcToRelative(1.922f, 1.922f, 0.0f, false, true, -0.232f, -0.675f)
                arcToRelative(4.688f, 4.688f, 0.0f, false, true, -0.07f, -0.837f)
                curveToRelative(0.0f, -0.116f, 0.0f, -0.232f, 0.023f, -0.395f)
                curveToRelative(0.022f, -0.163f, 0.047f, -0.372f, 0.07f, -0.372f)
                horizontalLineToRelative(-0.047f)
                curveToRelative(-0.373f, 0.93f, -0.883f, 1.604f, -1.534f, 2.14f)
                curveToRelative(-0.652f, 0.534f, -1.372f, 0.79f, -2.164f, 0.79f)
                curveToRelative(-0.535f, 0.0f, -0.977f, -0.21f, -1.28f, -0.605f)
                curveToRelative(-0.325f, -0.395f, -0.487f, -1.0f, -0.487f, -1.79f)
                curveToRelative(0.0f, -0.117f, 0.0f, -0.233f, 0.022f, -0.373f)
                curveToRelative(0.023f, -0.116f, 0.023f, -0.162f, 0.046f, -0.395f)
                horizontalLineToRelative(-0.163f)
                curveToRelative(-0.209f, 0.465f, -0.395f, 1.116f, -0.534f, 1.698f)
                curveToRelative(-0.14f, 0.58f, -0.255f, 1.116f, -0.326f, 1.604f)
                curveToRelative(-0.093f, 0.489f, -0.14f, 0.93f, -0.186f, 1.303f)
                curveToRelative(-0.047f, 0.372f, -0.07f, 0.628f, -0.093f, 0.767f)
                curveToRelative(0.023f, 0.116f, 0.046f, 0.233f, 0.07f, 0.372f)
                curveToRelative(0.046f, 0.14f, 0.07f, 0.28f, 0.116f, 0.396f)
                curveToRelative(0.046f, 0.116f, 0.07f, 0.255f, 0.093f, 0.372f)
                curveToRelative(0.023f, 0.116f, 0.046f, 0.209f, 0.046f, 0.279f)
                curveToRelative(0.0f, 0.325f, -0.07f, 0.58f, -0.209f, 0.744f)
                curveToRelative(-0.14f, 0.162f, -0.302f, 0.255f, -0.465f, 0.255f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, -0.535f, -0.186f)
                curveToRelative(-0.163f, -0.14f, -0.232f, -0.35f, -0.232f, -0.628f)
                curveToRelative(0.0f, -0.396f, 0.07f, -0.907f, 0.21f, -1.512f)
                curveToRelative(0.14f, -0.604f, 0.348f, -1.372f, 0.604f, -2.279f)
                curveToRelative(0.14f, -0.418f, 0.255f, -0.837f, 0.395f, -1.256f)
                curveToRelative(0.14f, -0.418f, 0.256f, -0.814f, 0.372f, -1.162f)
                curveToRelative(0.116f, -0.35f, 0.21f, -0.675f, 0.302f, -0.954f)
                arcToRelative(3.71f, 3.71f, 0.0f, false, false, 0.163f, -0.65f)
                curveToRelative(0.023f, -0.07f, 0.047f, -0.234f, 0.07f, -0.466f)
                curveToRelative(0.023f, -0.233f, 0.046f, -0.489f, 0.093f, -0.79f)
                curveToRelative(0.046f, -0.303f, 0.07f, -0.629f, 0.116f, -0.954f)
                curveToRelative(0.047f, -0.35f, 0.093f, -0.652f, 0.116f, -0.93f)
                curveToRelative(0.047f, -0.21f, 0.07f, -0.443f, 0.117f, -0.698f)
                curveToRelative(0.046f, -0.255f, 0.116f, -0.512f, 0.209f, -0.72f)
                curveToRelative(0.093f, -0.233f, 0.233f, -0.42f, 0.395f, -0.583f)
                curveToRelative(0.163f, -0.162f, 0.372f, -0.232f, 0.628f, -0.232f)
                curveToRelative(0.28f, 0.0f, 0.465f, 0.093f, 0.558f, 0.256f)
                curveToRelative(0.093f, 0.162f, 0.14f, 0.372f, 0.117f, 0.604f)
                curveToRelative(-0.023f, 0.233f, -0.047f, 0.49f, -0.117f, 0.744f)
                curveToRelative(-0.07f, 0.256f, -0.14f, 0.49f, -0.21f, 0.675f)
                curveToRelative(-0.185f, 0.581f, -0.371f, 1.116f, -0.58f, 1.558f)
                curveToRelative(-0.21f, 0.442f, -0.396f, 0.93f, -0.558f, 1.442f)
                curveToRelative(-0.14f, 0.35f, -0.186f, 0.674f, -0.186f, 0.953f)
                curveToRelative(0.0f, 0.512f, 0.162f, 0.884f, 0.465f, 1.163f)
                curveToRelative(0.325f, 0.28f, 0.697f, 0.395f, 1.14f, 0.395f)
                arcToRelative(1.63f, 1.63f, 0.0f, false, false, 1.022f, -0.372f)
                curveToRelative(0.326f, -0.255f, 0.628f, -0.558f, 0.907f, -0.907f)
                curveToRelative(0.28f, -0.348f, 0.512f, -0.72f, 0.698f, -1.14f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 0.419f, -1.069f)
                curveToRelative(0.023f, -0.046f, 0.046f, -0.14f, 0.07f, -0.325f)
                curveToRelative(0.046f, -0.187f, 0.07f, -0.396f, 0.116f, -0.628f)
                curveToRelative(0.046f, -0.233f, 0.093f, -0.465f, 0.14f, -0.72f)
                curveToRelative(0.046f, -0.257f, 0.091f, -0.466f, 0.116f, -0.629f)
                curveToRelative(0.046f, -0.186f, 0.07f, -0.372f, 0.116f, -0.605f)
                curveToRelative(0.046f, -0.232f, 0.116f, -0.442f, 0.21f, -0.65f)
                curveToRelative(0.092f, -0.21f, 0.232f, -0.373f, 0.371f, -0.513f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, 0.605f, -0.209f)
                curveToRelative(0.302f, 0.0f, 0.488f, 0.093f, 0.605f, 0.256f)
                curveToRelative(0.093f, 0.163f, 0.14f, 0.372f, 0.14f, 0.605f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, -0.117f, 0.697f)
                curveToRelative(-0.07f, 0.233f, -0.116f, 0.42f, -0.163f, 0.558f)
                arcToRelative(23.236f, 23.236f, 0.0f, false, true, -0.558f, 1.558f)
                curveToRelative(-0.186f, 0.466f, -0.349f, 0.884f, -0.512f, 1.21f)
                curveToRelative(-0.14f, 0.349f, -0.256f, 0.604f, -0.349f, 0.814f)
                curveToRelative(-0.093f, 0.21f, -0.14f, 0.349f, -0.14f, 0.418f)
                curveToRelative(0.0f, 0.605f, 0.14f, 1.047f, 0.396f, 1.303f)
                curveToRelative(0.256f, 0.255f, 0.535f, 0.395f, 0.837f, 0.395f)
                curveToRelative(0.512f, 0.0f, 0.907f, -0.163f, 1.21f, -0.465f)
                curveToRelative(0.302f, -0.326f, 0.535f, -0.907f, 0.674f, -1.605f)
                horizontalLineToRelative(0.186f)
                arcToRelative(5.386f, 5.386f, 0.0f, false, true, -0.14f, 1.698f)
                close()
            }
        }
        .build()
        return _microeditor!!
    }

private var _microeditor: ImageVector? = null
